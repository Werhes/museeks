package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5687e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f12080e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12081e;

    public /* synthetic */ C5687e(Context context, int i) {
        this.f12081e = i;
        this.f12080e = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Window window;
        switch (this.f12081e) {
            case 0:
                Activity appmetrica = AbstractC15946e.appmetrica(this.f12080e);
                if (appmetrica == null || (window = appmetrica.getWindow()) == null) {
                    return new C1023e(0);
                }
                window.addFlags(128);
                return new C6035e(0, window);
            case 1:
                Activity appmetrica2 = AbstractC15946e.appmetrica(this.f12080e);
                if (appmetrica2 == null) {
                    return new C1023e(1);
                }
                int requestedOrientation = appmetrica2.getRequestedOrientation();
                appmetrica2.setRequestedOrientation(1);
                return new C17752e(appmetrica2, requestedOrientation);
            case 2:
                return BitmapFactory.decodeResource(this.f12080e.getApplicationContext().getResources(), ((Integer) obj).intValue());
            default:
                List list = (List) obj;
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                c7838e.getClass();
                if (!list.isEmpty()) {
                    c7838e.startapp(new C14078e(c7838e, list, false, (InterfaceC5083e) null));
                }
                Context context = this.f12080e;
                AppActivity appActivity = context instanceof AppActivity ? (AppActivity) context : null;
                if (appActivity != null) {
                    Integer valueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    C9402e.ad(appActivity, new C15076e(valueOf, (vKXApplication != null ? vKXApplication : null).getString(R.string.play_next_ok), null, null, null, 84));
                }
                return Unit.INSTANCE;
        }
    }
}
