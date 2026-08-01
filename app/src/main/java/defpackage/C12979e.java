package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12979e extends AbstractC16634e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final /* synthetic */ int f25885e = 0;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final ArrayList f25886e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C11770e f25887e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public Function0 f25888e = new C14136e(24);

    public C12979e(ArrayList arrayList, C11770e c11770e) {
        this.f25886e = arrayList;
        this.f25887e = c11770e;
    }

    public static final void isPro(C12979e c12979e, C11973e c11973e) {
        C18236e c18236e;
        c12979e.getClass();
        C18422e c18422e = c11973e.vip;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) String.valueOf(c18422e.metrica));
        sb.append('_');
        sb.append(c18422e.vip);
        String sb2 = sb.toString();
        String str = c18422e.license;
        String str2 = c18422e.ad;
        C5442e c5442e = c18422e.admob;
        new C1208e(new C12510e(sb2, str, str2, (c5442e == null || (c18236e = c5442e.appmetrica) == null) ? null : c18236e.yandex, c18422e.mopub)).signatures(c12979e.f10582e);
    }

    @Override // defpackage.AbstractC5004e
    public final void adcel() {
        if (((Boolean) this.f25888e.invoke()).booleanValue()) {
            return;
        }
        super.adcel();
    }

    public final void inmobi(InterfaceC1332e interfaceC1332e, C13770e c13770e, int i) {
        c13770e.m3671package(949408498);
        int i2 = i | (c13770e.purchase(interfaceC1332e) ? 4 : 2) | (c13770e.yandex(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC3314e vip = AbstractC3265e.vip(((C10366e) interfaceC1332e).purchase, c13770e, 0);
            AbstractC13348e.ad(null, null, AbstractC16653e.license(1176852855, new C9130e(interfaceC1332e, vip, 25), c13770e), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(2125111745, new C8124e(27, interfaceC1332e, this, vip), c13770e), c13770e, 905970048, 251);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9130e(this, interfaceC1332e, i, 26);
        }
    }

    @Override // defpackage.AbstractC16634e
    public final Object isVip(C5435e c5435e) {
        C10366e c10366e = new C10366e(this.f25886e, c5435e, new C6846e(20, this), new C13465e(12, this));
        this.f25888e = new C7755e(0, c10366e, C10366e.class, "onBackPressed", "onBackPressed()Z", 0, 0, 4);
        return c10366e;
    }

    @Override // defpackage.AbstractC16634e
    public final /* bridge */ /* synthetic */ void tapsense(Object obj, C13770e c13770e) {
        inmobi((InterfaceC1332e) obj, c13770e, 0);
    }
}
