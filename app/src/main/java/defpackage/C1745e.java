package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1745e implements InterfaceC13466e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ScrollFeedbackProvider f4747e;

    public C1745e(NestedScrollView nestedScrollView) {
        this.f4747e = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.InterfaceC13466e
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.f4747e.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.InterfaceC13466e
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.f4747e.onScrollProgress(i, i2, i3, i4);
    }
}
