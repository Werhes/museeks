package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10569e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5422e f20860e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20861e;

    public /* synthetic */ C10569e(C5422e c5422e, int i) {
        this.f20861e = i;
        this.f20860e = c5422e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f20861e) {
            case 0:
                C5422e c5422e = this.f20860e;
                new C18480e(c5422e.m1911package(), (EnumC10982e) c5422e.f11614e.getValue()).signatures(c5422e.pro());
                return Unit.INSTANCE;
            case 1:
                this.f20860e.m2514goto(new C1374e());
                return Unit.INSTANCE;
            case 2:
                this.f20860e.m2514goto(new AbstractC10347e(0));
                return Unit.INSTANCE;
            case 3:
                C5422e c5422e2 = this.f20860e;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c5422e2.vip()), null, 0, new C17019e(c5422e2, (InterfaceC5083e) null, 7), 3);
                return Unit.INSTANCE;
            default:
                this.f20860e.pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vkx.app/license")));
                return Unit.INSTANCE;
        }
    }
}
