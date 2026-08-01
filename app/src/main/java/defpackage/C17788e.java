package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C12539e.class)
/* renamed from: eٕ٘۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17788e extends AbstractC4879e {
    public static final C15151e Companion = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f34872e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte f34873e;

    public C17788e(byte b, byte[] bArr) {
        this.f34873e = b;
        this.f34872e = bArr;
    }

    @Override // defpackage.AbstractC4879e
    public final int appmetrica() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C17788e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C17788e c17788e = (C17788e) obj;
        return this.f34873e == c17788e.f34873e && Arrays.equals(this.f34872e, c17788e.f34872e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f34872e) + (this.f34873e * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BsonBinary(type=");
        sb.append((int) this.f34873e);
        sb.append(", data=");
        return AbstractC4653e.applovin(sb, AbstractC1660e.m671interface(this.f34872e, ",", null, 56), ')');
    }
}
