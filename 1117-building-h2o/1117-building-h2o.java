class H2O {
    Semaphore hy, ox;
    public H2O() {
        hy = new Semaphore(2);
        ox = new Semaphore(0);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        hy.acquire();
        releaseHydrogen.run();
        ox.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        ox.acquire(2);
		releaseOxygen.run();
        hy.release(2);
    }
}