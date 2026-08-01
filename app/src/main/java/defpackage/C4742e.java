package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًؗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4742e {
    public static final C17657e Companion = new Object();
    public static final InterfaceC3477e[] metrica = {null, AbstractC18039e.appmetrica(2, new C9283e(24))};
    public final Integer ad;
    public final EnumC10057e vip;

    public /* synthetic */ C4742e(int i, Integer num, EnumC10057e enumC10057e) {
        if ((i & 1) == 0) {
            this.ad = null;
        } else {
            this.ad = num;
        }
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = enumC10057e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4742e)) {
            return false;
        }
        C4742e c4742e = (C4742e) obj;
        return AbstractC7890e.billing(this.ad, c4742e.ad) && this.vip == c4742e.vip;
    }

    public final int hashCode() {
        Integer num = this.ad;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        EnumC10057e enumC10057e = this.vip;
        return hashCode + (enumC10057e != null ? enumC10057e.hashCode() : 0);
    }

    public final String toString() {
        return "AudioChartInfoDto(position=" + this.ad + ", state=" + this.vip + ")";
    }
}
