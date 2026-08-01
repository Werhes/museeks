package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.appmetrica;
import androidx.recyclerview.widget.smaato;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0842e extends appmetrica {
    public final /* synthetic */ int admob;
    public final /* synthetic */ C17281e subscription;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0842e(C17281e c17281e, Context context, int i) {
        super(context);
        this.admob = i;
        this.subscription = c17281e;
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public int appmetrica(int i) {
        switch (this.admob) {
            case 0:
                return Math.min(100, super.appmetrica(i));
            default:
                return super.appmetrica(i);
        }
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public final float license(DisplayMetrics displayMetrics) {
        int i;
        switch (this.admob) {
            case 0:
                i = displayMetrics.densityDpi;
                break;
            default:
                i = displayMetrics.densityDpi;
                break;
        }
        return 100.0f / i;
    }

    @Override // androidx.recyclerview.widget.appmetrica
    public final void yandex(View view, smaato smaatoVar) {
        switch (this.admob) {
            case 0:
                C17281e c17281e = this.subscription;
                int[] vip = c17281e.vip(c17281e.ad.getLayoutManager(), view);
                int i = vip[0];
                int i2 = vip[1];
                int ceil = (int) Math.ceil(appmetrica(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    smaatoVar.ad = i;
                    smaatoVar.vip = i2;
                    smaatoVar.metrica = ceil;
                    smaatoVar.appmetrica = this.adcel;
                    smaatoVar.purchase = true;
                    return;
                }
                return;
            default:
                C17281e c17281e2 = this.subscription;
                RecyclerView recyclerView = c17281e2.ad;
                if (recyclerView == null) {
                    return;
                }
                int[] vip2 = c17281e2.vip(recyclerView.getLayoutManager(), view);
                int i3 = vip2[0];
                int i4 = vip2[1];
                int ceil2 = (int) Math.ceil(appmetrica(Math.max(Math.abs(i3), Math.abs(i4))) / 0.3356d);
                if (ceil2 > 0) {
                    smaatoVar.ad = i3;
                    smaatoVar.vip = i4;
                    smaatoVar.metrica = ceil2;
                    smaatoVar.appmetrica = this.adcel;
                    smaatoVar.purchase = true;
                    return;
                }
                return;
        }
    }
}
