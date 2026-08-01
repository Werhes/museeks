package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٞۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7332e extends C1930e {
    public static final ReentrantLock adcel;
    public static final long advert;
    public static final Condition mopub;
    public static final long smaato;
    public static C7332e startapp;
    public static final C13572e yandex;
    public int appmetrica;
    public long billing;
    public int purchase = -1;

    static {
        C13572e c13572e = new C13572e(16, false);
        c13572e.f26878e = new C7332e[8];
        yandex = c13572e;
        ReentrantLock reentrantLock = new ReentrantLock();
        adcel = reentrantLock;
        mopub = reentrantLock.newCondition();
        long millis = TimeUnit.SECONDS.toMillis(60L);
        advert = millis;
        smaato = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public IOException adcel(IOException iOException) {
        throw null;
    }

    public void mopub() {
    }

    public final boolean startapp() {
        ReentrantLock reentrantLock = adcel;
        reentrantLock.lock();
        try {
            int i = this.appmetrica;
            this.appmetrica = 0;
            if (i != 1) {
                return i == 2;
            }
            yandex.isVip(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void yandex() {
        long j = this.metrica;
        boolean z = this.ad;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = adcel;
            reentrantLock.lock();
            try {
                if (this.appmetrica != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.appmetrica = 1;
                C15802e.license(this);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
