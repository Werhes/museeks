package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Unit;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11069e {
    public static final C14808e Signature;
    public static final C14808e adcel;
    public static final C14808e admob;
    public static final C14808e advert;
    public static final C14808e amazon;
    public static final C14808e billing;
    public static final C14808e loadAd;
    public static final C14808e mopub;
    public static final C14808e pro;
    public static final C14808e purchase;
    public static final C14808e remoteconfig;
    public static final C14808e smaato;
    public static final C14808e startapp;
    public static final C14808e subscription;
    public static final C14808e yandex;
    public final InterfaceC7227e ad;
    public final int appmetrica;
    public final int license;
    public final C11397e metrica;
    public final Object vip;

    static {
        C12232e c12232e = AbstractC3820e.ad;
        int i = 1;
        int i2 = 1;
        C14808e c14808e = new C14808e(i, c12232e.vip(Boolean.TYPE), i2, Boolean.FALSE, 32, 3);
        purchase = c14808e;
        Class cls = Integer.TYPE;
        int i3 = 0;
        int i4 = 32;
        C14808e c14808e2 = new C14808e(i, c12232e.vip(cls), i2, i3, i4, 10);
        billing = c14808e2;
        new C5149e(c14808e2, 0);
        C14808e c14808e3 = new C14808e(i, c12232e.vip(cls), i2, i3, i4, 19);
        yandex = c14808e3;
        new C5149e(c14808e3, 0);
        new C5149e(new C14808e(i, c12232e.vip(cls), i2, i3, i4, 12), 0);
        int i5 = 32;
        int i6 = 7;
        int i7 = 4;
        int i8 = 1;
        C14808e c14808e4 = new C14808e(i7, c12232e.vip(cls), i8, i3, i5, i6);
        startapp = c14808e4;
        new C5149e(c14808e4, 0);
        new C5149e(new C14808e(i7, c12232e.vip(cls), i8, i3, i5, i6), 0);
        Class cls2 = Long.TYPE;
        long j = 0L;
        int i9 = 32;
        C14808e c14808e5 = new C14808e(i, c12232e.vip(cls2), i2, j, i9, 11);
        adcel = c14808e5;
        new C5149e(c14808e5, 1);
        C14808e c14808e6 = new C14808e(i, c12232e.vip(cls2), i2, j, i9, 20);
        mopub = c14808e6;
        new C5149e(c14808e6, 1);
        new C5149e(new C14808e(i, c12232e.vip(cls2), i2, j, i9, 13), 1);
        int i10 = 8;
        int i11 = 2;
        C14808e c14808e7 = new C14808e(i11, c12232e.vip(cls2), i8, j, i5, i10);
        advert = c14808e7;
        new C5149e(c14808e7, 1);
        new C5149e(new C14808e(i11, c12232e.vip(cls2), i8, j, i5, i10), 1);
        int i12 = 32;
        C14808e c14808e8 = new C14808e(4, c12232e.vip(Float.TYPE), i2, Float.valueOf(0.0f), i12, 1);
        smaato = c14808e8;
        new C2117e(c14808e8, (byte) 0);
        C14808e c14808e9 = new C14808e(2, c12232e.vip(Double.TYPE), i2, Double.valueOf(0.0d), i12, 0);
        amazon = c14808e9;
        new C2117e(c14808e9);
        int i13 = 3;
        C14808e c14808e10 = new C14808e(i13, c12232e.vip(C0193e.class), i2, C0193e.f1409e, i12, 4);
        loadAd = c14808e10;
        C14808e c14808e11 = new C14808e(i13, c12232e.vip(String.class), i2, BuildConfig.FLAVOR, i12, 14);
        Signature = c14808e11;
        int i14 = 48;
        int i15 = 2;
        Object obj = null;
        new C14808e(i13, c12232e.vip(Unit.class), i15, obj, i14, 6);
        admob = new C14808e(i13, c12232e.vip(Map.class), i15, obj, i14, 16);
        subscription = new C14808e(i13, c12232e.vip(Map.class), i15, obj, i14, 15);
        remoteconfig = new C14808e(i, c12232e.vip(Void.class), i15, null, 48, 17);
        pro = new C14808e(i13, c12232e.vip(Object.class), i15, obj, i14, 18);
        AbstractC7779e.ad(c14808e9, "type.googleapis.com/google.protobuf.DoubleValue");
        AbstractC7779e.ad(c14808e8, "type.googleapis.com/google.protobuf.FloatValue");
        AbstractC7779e.ad(c14808e5, "type.googleapis.com/google.protobuf.Int64Value");
        AbstractC7779e.ad(c14808e6, "type.googleapis.com/google.protobuf.UInt64Value");
        AbstractC7779e.ad(c14808e2, "type.googleapis.com/google.protobuf.Int32Value");
        AbstractC7779e.ad(c14808e3, "type.googleapis.com/google.protobuf.UInt32Value");
        AbstractC7779e.ad(c14808e, "type.googleapis.com/google.protobuf.BoolValue");
        AbstractC7779e.ad(c14808e11, "type.googleapis.com/google.protobuf.StringValue");
        AbstractC7779e.ad(c14808e10, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            new C14808e(i13, c12232e.vip(Duration.class), i15, null, 48, 5);
        } catch (NoClassDefFoundError unused) {
            new C14808e();
        }
        try {
            new C14808e(i13, AbstractC3820e.ad.vip(Instant.class), i15, null, 48, 9);
        } catch (NoClassDefFoundError unused2) {
            new C14808e();
        }
    }

    public AbstractC11069e(int i, InterfaceC7227e interfaceC7227e, int i2, Object obj) {
        this.license = i;
        this.ad = interfaceC7227e;
        this.appmetrica = i2;
        this.vip = obj;
        boolean z = this instanceof C15429e;
        if (!z && !(this instanceof C11397e) && i != 3) {
            if (i == 3) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.");
            }
            new C15429e(this);
        }
        this.metrica = ((this instanceof C11397e) || z) ? null : new C11397e(this);
    }

    public /* synthetic */ AbstractC11069e(int i, InterfaceC7227e interfaceC7227e, int i2, Object obj, int i3) {
        this(i, interfaceC7227e, i2, (i3 & 16) != 0 ? null : obj);
    }

    public final C11397e ad() {
        C11397e c11397e = this.metrica;
        if (c11397e != null) {
            return c11397e;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public void adcel(C17790e c17790e, int i, Object obj) {
        if (obj != null) {
            int i2 = this.license;
            if (i2 == 3) {
                int pro2 = c17790e.pro();
                billing(c17790e, obj);
                c17790e.m4433super(c17790e.pro() - pro2);
            } else {
                billing(c17790e, obj);
            }
            c17790e.getClass();
            c17790e.m4433super((i << 3) | AbstractC4653e.signatures(i2));
        }
    }

    public int advert(int i, Object obj) {
        if (obj == null) {
            return 0;
        }
        int mopub2 = mopub(obj);
        int i2 = 5;
        if (this.license == 3) {
            mopub2 += (mopub2 & (-128)) == 0 ? 1 : (mopub2 & (-16384)) == 0 ? 2 : (mopub2 & (-2097152)) == 0 ? 3 : (mopub2 & (-268435456)) == 0 ? 4 : 5;
        }
        int i3 = i << 3;
        if ((i3 & (-128)) == 0) {
            i2 = 1;
        } else if ((i3 & (-16384)) == 0) {
            i2 = 2;
        } else if ((i3 & (-2097152)) == 0) {
            i2 = 3;
        } else if ((i3 & (-268435456)) == 0) {
            i2 = 4;
        }
        return mopub2 + i2;
    }

    public final void appmetrica(InterfaceC11855e interfaceC11855e, Object obj) {
        C17790e c17790e = new C17790e(0);
        billing(c17790e, obj);
        c17790e.billing();
        interfaceC11855e.mo2629class((C16151e) c17790e.f34879e);
    }

    public abstract void billing(C17790e c17790e, Object obj);

    public final Object license(InputStream inputStream) {
        return metrica(new C17546e(new C13197e(AbstractC8636e.appmetrica(inputStream))));
    }

    public abstract Object metrica(C17546e c17546e);

    public abstract int mopub(Object obj);

    public abstract void purchase(C0444e c0444e, Object obj);

    public void startapp(C0444e c0444e, int i, Object obj) {
        if (obj != null) {
            c0444e.getClass();
            int i2 = this.license;
            c0444e.m353protected((i << 3) | AbstractC4653e.signatures(i2));
            if (i2 == 3) {
                c0444e.m353protected(mopub(obj));
            }
            purchase(c0444e, obj);
        }
    }

    public Object vip(C17582e c17582e) {
        C18158e c18158e = c17582e.adcel;
        if (c18158e == null) {
            c18158e = new C18158e(c17582e);
            c17582e.adcel = c18158e;
        }
        return metrica(c18158e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, eًؓٛ] */
    public final void yandex(OutputStream outputStream, Object obj) {
        C4122e c4122e = new C4122e(outputStream, new Object());
        C9674e c9674e = new C9674e(c4122e);
        appmetrica(c9674e, obj);
        if (c9674e.f19171e) {
            throw new IllegalStateException("closed");
        }
        C16151e c16151e = c9674e.f19172e;
        long j = c16151e.f31731e;
        if (j > 0) {
            c4122e.mo272transient(c16151e, j);
        }
    }
}
