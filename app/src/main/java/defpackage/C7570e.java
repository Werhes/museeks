package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7570e implements InterfaceC5366e {
    public final C10566e ad;
    public final int vip;

    public C7570e(String str, int i) {
        this.ad = new C10566e(str);
        this.vip = i;
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        int i = c11199e.f22465e;
        C10566e c10566e = this.ad;
        if (i != -1) {
            int i2 = c11199e.f22462e;
            String str = c10566e.f20850e;
            String str2 = c10566e.f20850e;
            c11199e.yandex(i, i2, str);
            if (str2.length() > 0) {
                c11199e.startapp(i, str2.length() + i);
            }
        } else {
            int i3 = c11199e.f22464e;
            int i4 = c11199e.f22463e;
            String str3 = c10566e.f20850e;
            String str4 = c10566e.f20850e;
            c11199e.yandex(i3, i4, str3);
            if (str4.length() > 0) {
                c11199e.startapp(i3, str4.length() + i3);
            }
        }
        int i5 = c11199e.f22464e;
        int i6 = c11199e.f22463e;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.vip;
        int metrica = AbstractC3062e.metrica(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c10566e.f20850e.length(), 0, ((C9831e) c11199e.f22467e).m2700interface());
        c11199e.adcel(metrica, metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7570e)) {
            return false;
        }
        C7570e c7570e = (C7570e) obj;
        return AbstractC7890e.billing(this.ad.f20850e, c7570e.ad.f20850e) && this.vip == c7570e.vip;
    }

    public final int hashCode() {
        return (this.ad.f20850e.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.ad.f20850e);
        sb.append("', newCursorPosition=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
