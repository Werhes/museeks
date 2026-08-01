package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15825e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f31256e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f31257e;

    public AbstractC15825e(int i) {
        this.f31257e = i;
    }

    public AbstractC15825e(C15794e c15794e, int i) {
        if (c15794e == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC8647e.isPro(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
        }
        this.f31257e = i;
        this.f31256e = c15794e;
    }

    public static C7233e adcel(byte[] bArr, int i, int i2, boolean z) {
        C7233e c7233e = new C7233e(bArr, i, i2, z);
        try {
            c7233e.subscription(i2);
            return c7233e;
        } catch (C8868e e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int appmetrica(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long billing(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int license(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long purchase(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void Signature(int i);

    public ByteBuffer ad(int i, byte[] bArr) {
        int[] metrica = metrica(AbstractC12608e.appmetrica(bArr), i);
        int[] iArr = (int[]) metrica.clone();
        AbstractC12608e.license(iArr);
        for (int i2 = 0; i2 < metrica.length; i2++) {
            metrica[i2] = metrica[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(metrica, 0, 16);
        return order;
    }

    public void admob(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != mopub()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + mopub());
        }
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer ad = ad(this.f31257e + i3, bArr);
            if (i3 == i) {
                AbstractC7640e.appmetrica(byteBuffer, byteBuffer2, ad, remaining % 64);
            } else {
                AbstractC7640e.appmetrica(byteBuffer, byteBuffer2, ad, 64);
            }
        }
    }

    public abstract int ads();

    public void advert(C12773e c12773e) {
    }

    public abstract C12948e amazon(C12948e c12948e, List list);

    public abstract float applovin();

    /* renamed from: class */
    public abstract long mo583class();

    public abstract long crashlytics();

    public abstract int firebase();

    /* renamed from: goto */
    public abstract String mo586goto();

    public abstract int inmobi();

    /* renamed from: interface */
    public abstract String mo588interface();

    public abstract long isPro();

    public abstract int isVip();

    public abstract C7302e loadAd(C12773e c12773e, C7302e c7302e);

    public abstract int[] metrica(int[] iArr, int i);

    public abstract int mopub();

    /* renamed from: native */
    public abstract int mo589native();

    public abstract long premium();

    public abstract C11507e pro();

    public abstract boolean remoteconfig();

    public abstract C2096e signatures();

    public void smaato(C12773e c12773e) {
    }

    public abstract boolean startapp();

    public abstract int subs();

    public abstract int subscription(int i);

    public abstract double tapsense();

    /* renamed from: this */
    public abstract int mo594this();

    /* renamed from: throw */
    public abstract long mo595throw();

    public abstract void vip(int i);

    /* renamed from: while */
    public abstract void mo474while(C0423e c0423e, Object obj);

    public abstract int yandex();
}
