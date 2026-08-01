package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1478e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f4350e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f4351e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4352e;

    public /* synthetic */ C1478e(int i, Context context, String str) {
        this.f4352e = i;
        this.f4351e = context;
        this.f4350e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4352e) {
            case 0:
                Context context = this.f4351e;
                boolean z = context instanceof AppActivity;
                String str = this.f4350e;
                if (z) {
                    C9402e.ad((AppActivity) context, new C15076e(null, context.getString(R.string.notification), str, null, null, 121));
                } else {
                    Toast.makeText(context, str, 1).show();
                }
                return Unit.INSTANCE;
            case 1:
                return AbstractC2745e.metrica(this.f4351e, this.f4350e);
            case 2:
                return AbstractC2745e.metrica(this.f4351e, this.f4350e);
            case 3:
                return this.f4351e.getSharedPreferences(this.f4350e, 0);
            default:
                return AbstractC2745e.metrica(this.f4351e, this.f4350e);
        }
    }
}
