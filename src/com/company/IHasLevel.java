package com.company;

public interface IHasLevel {
    public enum Level {
        FIRST(100), SECOND(200), THIRD(300), FINAL(400);
        private final int id;
        Level(int id){
            this.id=id;
        }
        public int getValue(){
            return id;
        }
    }
    public Level getLevel();
}
