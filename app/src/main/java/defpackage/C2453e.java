package defpackage;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.BuildConfig;
import org.mongodb.kbson.BsonObjectId$Companion;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C13613e.class)
/* renamed from: eٌؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2453e extends AbstractC4879e implements Comparable<C2453e> {
    public static final BsonObjectId$Companion Companion = new BsonObjectId$Companion(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final short f6267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f6268e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f6269e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6270e;

    static {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        C1909e c1909e = new C1909e(currentTimeMillis, currentTimeMillis >> 31);
        new AtomicInteger(c1909e.license());
        c1909e.appmetrica(16777216);
        c1909e.appmetrica(32768);
    }

    public C2453e(int i, int i2, short s, int i3) {
        this.f6270e = i;
        this.f6268e = i2;
        this.f6267e = s;
        this.f6269e = i3;
        if ((i2 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The random value must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (((-16777216) & i3) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C2453e c2453e) {
        byte[] yandex = yandex();
        byte[] yandex2 = c2453e.yandex();
        for (int i = 0; i < 12; i++) {
            byte b = yandex[i];
            byte b2 = yandex2[i];
            if (b != b2) {
                return (b & 255) < (b2 & 255) ? -1 : 1;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C2453e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C2453e c2453e = (C2453e) obj;
        return this.f6270e == c2453e.f6270e && this.f6268e == c2453e.f6268e && this.f6267e == c2453e.f6267e && this.f6269e == c2453e.f6269e;
    }

    public final int hashCode() {
        return (((((this.f6270e * 31) + this.f6268e) * 31) + this.f6267e) * 31) + this.f6269e;
    }

    public final String toString() {
        return "BsonObjectId(" + AbstractC1660e.m671interface(yandex(), BuildConfig.FLAVOR, C8082e.f16402e, 30).toLowerCase(Locale.ROOT) + ')';
    }

    public final byte[] yandex() {
        int i = this.f6270e;
        int i2 = this.f6268e;
        short s = this.f6267e;
        int i3 = this.f6269e;
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2, (byte) (s >> 8), (byte) s, (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3};
    }
}
