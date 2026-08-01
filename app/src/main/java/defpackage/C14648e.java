package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14648e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f28884e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28885e;

    public /* synthetic */ C14648e(Context context, int i) {
        this.f28885e = i;
        this.f28884e = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f28885e;
        Context context = this.f28884e;
        switch (i) {
            case 0:
                return new C4909e(context);
            case 1:
                File metrica = AbstractC2745e.metrica(context, "firebaseSessions/sessionConfigsDataStore.data");
                C15796e.license(metrica);
                return metrica;
            case 2:
                File metrica2 = AbstractC2745e.metrica(context, "firebaseSessions/sessionDataStore.data");
                C15796e.license(metrica2);
                return metrica2;
            case 3:
                AbstractC18467e.vip((AppActivity) context);
                return Unit.INSTANCE;
            case 4:
                int i2 = NextDockView.f36758e;
                return LayoutInflater.from(context);
            case 5:
                int i3 = AppActivity.f36539e;
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                Intent intent = new Intent(vKXApplication, (Class<?>) AppActivity.class);
                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                intent.setPackage((vKXApplication2 != null ? vKXApplication2 : null).getPackageName());
                intent.setAction("ua.itaysonlab.vkx.action.OPEN_PLAYER");
                intent.addFlags(536870912);
                return PendingIntent.getActivity(context, 0, intent, C7290e.adcel());
            case 6:
                return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            case 7:
                return context.getApplicationContext().getSharedPreferences("op_prefs", 0);
            case 8:
                return context.getApplicationContext().getSharedPreferences("op_theme_overrides", 0);
            default:
                return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
    }
}
