package defpackage;

import android.widget.PopupWindow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۛۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5163e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11467e f11048e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f11049e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f11050e;

    public /* synthetic */ C5163e(Function0 function0, C11467e c11467e, int i) {
        this.f11050e = i;
        this.f11049e = function0;
        this.f11048e = c11467e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f11050e) {
            case 0:
                this.f11049e.invoke();
                PopupWindow popupWindow = (PopupWindow) this.f11048e.f23071e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                return Unit.INSTANCE;
            default:
                this.f11049e.invoke();
                PopupWindow popupWindow2 = (PopupWindow) this.f11048e.f23071e;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                return Unit.INSTANCE;
        }
    }
}
