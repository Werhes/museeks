package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٝ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17161e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0438e f33652e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33653e;

    public /* synthetic */ C17161e(C0438e c0438e, int i) {
        this.f33653e = i;
        this.f33652e = c0438e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33653e) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = this.f33652e.ad;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC7547e(2, function0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                ActionMode actionMode = this.f33652e.yandex;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.INSTANCE;
            case 2:
                ActionMode actionMode2 = this.f33652e.yandex;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.INSTANCE;
            default:
                C0438e c0438e = this.f33652e;
                c0438e.appmetrica.license();
                return new C6035e(4, c0438e);
        }
    }
}
