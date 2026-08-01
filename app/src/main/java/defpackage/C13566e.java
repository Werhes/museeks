package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13566e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C10675e f26875e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f26876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13566e(C10675e c10675e, String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f26875e = c10675e;
        this.f26876e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C13566e(this.f26875e, this.f26876e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13566e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        ?? r1;
        Long l;
        Throwable th;
        AbstractC2003e.purchase(obj);
        C10675e c10675e = this.f26875e;
        C10675e metrica = c10675e.metrica();
        if (metrica != null) {
            AbstractC11062e.f21949e.purchase(metrica);
        }
        C18511e c18511e = AbstractC11062e.f21949e;
        String str = this.f26876e;
        C9674e c9674e = new C9674e(c18511e.mo1914break(c10675e, false));
        Long th2 = null;
        try {
            VKXApplication.Companion companion = VKXApplication.f36531e;
            C1343e ad = AbstractC12918e.ad();
            C18464e c18464e = new C18464e(23);
            c18464e.m4486e(str);
            C11058e purchase = ad.vip(new C8650e(c18464e)).purchase();
            try {
                l = new Long(c9674e.mo2629class(purchase.f21945e.mo1012e()));
                try {
                    purchase.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    purchase.close();
                } catch (Throwable th5) {
                    AbstractC13362e.license(th4, th5);
                }
                l = null;
                th = th4;
            }
        } catch (Throwable th6) {
            try {
                c9674e.close();
                r1 = th6;
            } catch (Throwable th7) {
                AbstractC13362e.license(th6, th7);
                r1 = th6;
            }
        }
        if (th != null) {
            throw th;
        }
        Long l2 = new Long(l.longValue());
        try {
            c9674e.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        r1 = th2;
        th2 = l2;
        if (r1 == 0) {
            return th2;
        }
        throw r1;
    }
}
