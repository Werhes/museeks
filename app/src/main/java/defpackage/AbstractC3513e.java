package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٞؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3513e {
    public int ad;
    public Object metrica;
    public int vip;

    /* renamed from: interface, reason: not valid java name */
    public static AbstractC3513e m1366interface(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new C1588e(inputStream, i);
        }
        C17054e c17054e = new C17054e(AbstractC17904e.ad);
        try {
            c17054e.applovin(0);
            return c17054e;
        } catch (C10895e e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: native, reason: not valid java name */
    public static long m1367native(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: this, reason: not valid java name */
    public static int m1368this(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract long Signature();

    /* renamed from: abstract */
    public abstract long mo621abstract();

    public abstract void ad(int i);

    public abstract int adcel();

    public abstract int admob();

    public abstract void ads(int i);

    public abstract float advert();

    public abstract long amazon();

    public abstract int applovin(int i);

    public abstract int appmetrica(int i);

    public abstract C6283e billing();

    /* renamed from: break */
    public abstract long mo622break();

    /* renamed from: case */
    public abstract int mo623case();

    /* renamed from: catch */
    public abstract boolean mo624catch();

    /* renamed from: class */
    public abstract void mo625class(int i);

    public abstract int crashlytics();

    /* renamed from: default */
    public abstract int mo628default();

    /* renamed from: extends */
    public abstract int mo630extends();

    /* renamed from: final */
    public abstract String mo631final();

    public abstract int firebase(int i, int i2, byte[] bArr);

    /* renamed from: goto, reason: not valid java name */
    public void m1369goto() {
        int mo630extends;
        do {
            mo630extends = mo630extends();
            if (mo630extends == 0) {
                return;
            }
            int i = this.ad;
            int i2 = this.vip;
            if (i + i2 >= 100) {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.vip = i2 + 1;
            this.vip--;
        } while (mo653while(mo630extends));
    }

    /* renamed from: implements */
    public abstract long mo634implements();

    /* renamed from: import */
    public abstract long mo635import();

    public abstract boolean inmobi(int i);

    /* renamed from: instanceof */
    public abstract int mo636instanceof();

    public void isPro() {
        int signatures;
        do {
            signatures = signatures();
            if (signatures == 0) {
                return;
            }
            int i = this.ad;
            int i2 = this.vip;
            if (i + i2 >= 100) {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.vip = i2 + 1;
            this.vip--;
        } while (inmobi(signatures));
    }

    public abstract long isVip();

    public abstract void license(int i);

    public abstract int loadAd();

    public abstract boolean metrica();

    public abstract long mopub();

    /* renamed from: new */
    public abstract C10553e mo637new();

    /* renamed from: package */
    public abstract int mo638package();

    public abstract int premium();

    /* renamed from: private */
    public abstract int mo639private();

    public abstract String pro();

    /* renamed from: protected */
    public abstract float mo640protected();

    public abstract boolean purchase();

    public abstract String remoteconfig();

    /* renamed from: return */
    public abstract long mo642return();

    public abstract int signatures();

    public abstract int smaato();

    public abstract int startapp();

    /* renamed from: static */
    public abstract long mo643static();

    /* renamed from: strictfp */
    public abstract byte[] mo644strictfp();

    public abstract boolean subs();

    public abstract long subscription();

    /* renamed from: super */
    public abstract String mo645super();

    /* renamed from: synchronized */
    public abstract int mo647synchronized();

    public abstract int tapsense();

    /* renamed from: throw */
    public abstract void mo648throw(int i);

    /* renamed from: transient */
    public abstract int mo650transient();

    /* renamed from: try */
    public abstract double mo651try();

    public abstract int vip();

    /* renamed from: while */
    public abstract boolean mo653while(int i);

    public abstract double yandex();
}
