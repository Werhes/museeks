package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0288e extends DataSetObserver {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C0288e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.ad) {
            case 0:
                ((C5856e) this.vip).appmetrica();
                return;
            case 1:
                C14271e c14271e = (C14271e) this.vip;
                if (c14271e.f28227e.isShowing()) {
                    c14271e.purchase();
                    return;
                }
                return;
            default:
                ((TabLayout) this.vip).appmetrica();
                return;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.ad) {
            case 0:
                ((C5856e) this.vip).appmetrica();
                return;
            case 1:
                ((C14271e) this.vip).dismiss();
                return;
            default:
                ((TabLayout) this.vip).appmetrica();
                return;
        }
    }
}
