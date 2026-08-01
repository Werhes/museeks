package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11472e extends LinearLayoutManager {

    /* renamed from: class, reason: not valid java name */
    public final /* synthetic */ C1421e f23073class;
    public final /* synthetic */ int firebase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11472e(C1421e c1421e, int i, int i2) {
        super(i);
        this.f23073class = c1421e;
        this.firebase = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: eٟؒؗ */
    public final void mo82e(C6226e c6226e, int[] iArr) {
        int i = this.firebase;
        C1421e c1421e = this.f23073class;
        if (i == 0) {
            iArr[0] = c1421e.f4250e.getWidth();
            iArr[1] = c1421e.f4250e.getWidth();
        } else {
            iArr[0] = c1421e.f4250e.getHeight();
            iArr[1] = c1421e.f4250e.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.adcel
    /* renamed from: eِؗؓ */
    public final void mo92e(RecyclerView recyclerView, int i) {
        C8413e c8413e = new C8413e(recyclerView.getContext());
        c8413e.ad = i;
        m153e(c8413e);
    }
}
