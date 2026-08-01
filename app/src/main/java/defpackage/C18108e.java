package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18108e implements InterfaceC7449e, InterfaceC8427e, InterfaceC7898e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f35501e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f35502e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35503e;

    public /* synthetic */ C18108e(Object obj, boolean z, int i) {
        this.f35503e = i;
        this.f35501e = obj;
        this.f35502e = z;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        ((C6268e) obj).mo3032e((C3335e) this.f35501e, this.f35502e);
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        SharedPreferences.Editor edit = AbstractC9110e.purchase((Context) this.f35501e).edit();
        edit.putBoolean("proxy_retention", this.f35502e);
        edit.apply();
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        switch (this.f35503e) {
            case 0:
                C1410e ads = AbstractC17475e.ads((C1962e) this.f35501e);
                boolean z = this.f35502e;
                return c6584e.crashlytics(c18424e, ads, z ? -1 : c6584e.pro.mo2115e(), z ? -9223372036854775807L : c6584e.pro.mo2071e());
            default:
                List list = (List) this.f35501e;
                boolean z2 = this.f35502e;
                return c6584e.crashlytics(c18424e, list, z2 ? -1 : c6584e.pro.mo2115e(), z2 ? -9223372036854775807L : c6584e.pro.mo2071e());
        }
    }
}
