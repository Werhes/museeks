package defpackage;

import android.content.Intent;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6349e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3655e f13191e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13192e;

    public /* synthetic */ C6349e(AbstractC3655e abstractC3655e, int i) {
        this.f13192e = i;
        this.f13191e = abstractC3655e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13192e;
        AbstractC3655e abstractC3655e = this.f13191e;
        switch (i) {
            case 0:
                abstractC3655e.mo1388instanceof();
                return Unit.INSTANCE;
            case 1:
                abstractC3655e.mo1388instanceof();
                return Unit.INSTANCE;
            default:
                if (((InterfaceC4977e) abstractC3655e.f8236e.getValue()) instanceof C5134e) {
                    VKXApplication.Companion companion = VKXApplication.f36531e;
                    if (!VKXApplication.Companion.metrica() && Build.VERSION.SDK_INT >= 29) {
                        abstractC3655e.pro().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                        return Unit.INSTANCE;
                    }
                }
                abstractC3655e.f8231e.invoke();
                return Unit.INSTANCE;
        }
    }
}
