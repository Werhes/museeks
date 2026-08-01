package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؔؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2545e extends AbstractC9510e {
    public final int adcel;
    public final InterfaceC11129e startapp;
    public final double yandex;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2545e(double d, int i, int i2) {
        this(d, C2991e.metrica, (i2 & 4) != 0 ? 0 : i);
        InterfaceC11129e.vip.getClass();
    }

    public C2545e(double d, InterfaceC11129e interfaceC11129e, int i) {
        this.yandex = d;
        this.startapp = interfaceC11129e;
        this.adcel = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2545e)) {
            return false;
        }
        C2545e c2545e = (C2545e) obj;
        return Double.compare(this.yandex, c2545e.yandex) == 0 && AbstractC7890e.billing(this.startapp, c2545e.startapp) && this.adcel == c2545e.adcel;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.yandex);
        return ((this.startapp.hashCode() + (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31)) * 31) + this.adcel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(quality=");
        sb.append(this.yandex);
        sb.append(", parameters=");
        sb.append(this.startapp);
        sb.append(", segmentIncrement=");
        return AbstractC1786e.pro(sb, this.adcel, ')');
    }
}
