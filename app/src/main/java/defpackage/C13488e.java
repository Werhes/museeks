package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13488e {
    public int ad;
    public boolean appmetrica;
    public final /* synthetic */ StaggeredGridLayoutManager billing;
    public boolean license;
    public boolean metrica;
    public int[] purchase;
    public int vip;

    public C13488e(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.billing = staggeredGridLayoutManager;
        ad();
    }

    public final void ad() {
        this.ad = -1;
        this.vip = RecyclerView.UNDEFINED_DURATION;
        this.metrica = false;
        this.license = false;
        this.appmetrica = false;
        int[] iArr = this.purchase;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
