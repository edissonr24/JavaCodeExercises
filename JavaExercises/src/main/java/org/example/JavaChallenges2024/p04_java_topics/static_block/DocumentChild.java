package org.example.JavaChallenges2024.p04_java_topics.static_block;

public class DocumentChild extends Document {

    @Override
    public void save() {
        super.save();
        this.backup();
    }

    public void backup() {
        System.out.println("Backup");
    }
}
