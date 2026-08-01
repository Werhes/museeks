package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13991e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f27712e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27713e;

    public /* synthetic */ C13991e(C5421e c5421e, int i) {
        this.f27713e = i;
        this.f27712e = c5421e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27713e) {
            case 0:
                this.f27712e.f11607e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 1:
                C5421e c5421e = this.f27712e;
                AbstractC16519e.vip((AppActivity) c5421e.pro(), new C2122e(c5421e, (InterfaceC5083e) null, 6));
                return Unit.INSTANCE;
            case 2:
                C5421e c5421e2 = this.f27712e;
                c5421e2.pro().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(c5421e2.m1909transient().ad.advert)));
                return Unit.INSTANCE;
            default:
                this.f27712e.f11607e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
