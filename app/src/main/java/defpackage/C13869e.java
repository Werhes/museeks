package defpackage;

import java.util.Arrays;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13869e implements InterfaceC1624e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ String vip;

    public /* synthetic */ C13869e(String str, int i) {
        this.ad = i;
        this.vip = str;
    }

    @Override // defpackage.InterfaceC1624e
    public final void ad(C0700e c0700e, Object obj, C4052e c4052e) {
        switch (this.ad) {
            case 0:
                ((InterfaceC8401e) obj).metrica(AbstractC0815e.admob(c0700e.vip, this.vip));
                return;
            case 1:
                ((InterfaceC8401e) obj).vip(AbstractC0815e.admob(c0700e.vip, this.vip));
                return;
            case 2:
                InterfaceC8401e interfaceC8401e = (InterfaceC8401e) obj;
                String[] split = AbstractC0815e.subscription(c0700e.vip, this.vip).split(AbstractC16316e.ad);
                if (split.length > 0) {
                    interfaceC8401e.appmetrica(Arrays.asList(split));
                    return;
                }
                return;
            case 3:
                InterfaceC8401e interfaceC8401e2 = (InterfaceC8401e) obj;
                Matcher matcher = AbstractC16316e.license.matcher(c0700e.vip);
                boolean matches = matcher.matches();
                String str = this.vip;
                if (!matches) {
                    throw new C15608e(17, str);
                }
                interfaceC8401e2.ad(new C3089e(AbstractC0815e.admob(matcher.group(1), str), AbstractC0815e.admob(matcher.group(2), str)));
                return;
            case 4:
                InterfaceC8401e interfaceC8401e3 = (InterfaceC8401e) obj;
                String str2 = c0700e.vip;
                try {
                    interfaceC8401e3.license(Float.parseFloat(str2));
                    return;
                } catch (NumberFormatException unused) {
                    throw C15608e.ad(this.vip, 33, str2);
                }
            default:
                ((InterfaceC8401e) obj).purchase(AbstractC0815e.subscription(c0700e.vip, this.vip));
                return;
        }
    }
}
