package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4669e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Activity f10008e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10009e;

    public /* synthetic */ C4669e(Activity activity, int i) {
        this.f10009e = i;
        this.f10008e = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10009e) {
            case 0:
                Activity activity = this.f10008e;
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/vkxfaq/55")));
                return Unit.INSTANCE;
            default:
                Activity activity2 = this.f10008e;
                if (activity2 != null) {
                    C14027e.ad.getClass();
                    AbstractC1831e.vip().metrica(C14027e.metrica());
                    C14027e.appmetrica(activity2);
                }
                return Unit.INSTANCE;
        }
    }
}
