package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9683e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ String f19180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9683e(String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f19180e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C9683e(this.f19180e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9683e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C1343e ad = AbstractC12918e.ad();
        C18464e c18464e = new C18464e(23);
        c18464e.m4486e(this.f19180e);
        C5363e c5363e = C0308e.appmetrica;
        ((C15783e) c18464e.f36192e).adcel("User-Agent", AbstractC18271e.metrica().license.pro());
        return ad.vip(new C8650e(c18464e)).purchase();
    }
}
