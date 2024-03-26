package springass5.springass5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class service {
	
	private final String url="jdbc:mysql://localhost:3306/springassignment";
	private final String username="root";
	private final String password="root";
	
	public List<Trainer> getAllTrainersWithSessions(){
		String  sql="SELECT t.trainer_id AS trainer_id, t.trainer_name AS trainer_name, s.session_id AS session_id, s.session_name AS session_name "+
					"FROM trainer t "+
					"LEFT JOIN session s ON t.trainer_id = s.session_id";
		
		List<Trainer> trainers=new ArrayList<>();
		try (Connection con= DriverManager.getConnection(url, username, password);
				PreparedStatement st= con.prepareStatement(sql);
				ResultSet rs=st.executeQuery()){
			Map<Integer, Trainer> trainerMap = new HashMap<>();
			while(rs.next()) {
				int trainerID= rs.getInt("trainer_id");
				String trainerName = rs.getString("trainer_name");
                int sessionId = rs.getInt("session_id");
                String sessionName = rs.getString("session_name");

                Trainer trainer = trainerMap.computeIfAbsent(trainerID, k -> {
                	Trainer newTrainer = new Trainer();
                    newTrainer.setId(trainerID);
                    newTrainer.setName(trainerName);
                    newTrainer.setSessions(new ArrayList<>());
                    return newTrainer;
                });

                if (sessionId > 0) {
                    session session = new session();
                    session.setId(sessionId);
                    session.setName(sessionName);
                    trainer.getSessions().add(session);
                }
            }

            trainers.addAll(trainerMap.values());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return trainers;
    }
}