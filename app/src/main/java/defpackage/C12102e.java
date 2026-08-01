package defpackage;

import androidx.car.app.model.Alert;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12102e implements InterfaceC2209e {
    public C14323e vip;
    public String ad = BuildConfig.FLAVOR;
    public int metrica = Alert.DURATION_SHOW_INDEFINITELY;
    public InterfaceC7189e license = C17043e.ad;

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC2209e ad() {
        C12102e c12102e = new C12102e();
        c12102e.license = this.license;
        c12102e.ad = this.ad;
        c12102e.vip = this.vip;
        c12102e.metrica = this.metrica;
        return c12102e;
    }

    @Override // defpackage.InterfaceC2209e
    public final void metrica(InterfaceC7189e interfaceC7189e) {
        this.license = interfaceC7189e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmittableText(");
        sb.append(this.ad);
        sb.append(", style=");
        sb.append(this.vip);
        sb.append(", modifier=");
        sb.append(this.license);
        sb.append(", maxLines=");
        return AbstractC1786e.pro(sb, this.metrica, ')');
    }

    @Override // defpackage.InterfaceC2209e
    public final InterfaceC7189e vip() {
        return this.license;
    }
}
