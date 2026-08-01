package defpackage;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2466e extends AbstractC7483e {
    public final /* synthetic */ int appmetrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2466e(C9730e c9730e, int i) {
        super(c9730e);
        this.appmetrica = i;
    }

    @Override // defpackage.AbstractC7483e
    public void admob() {
        switch (this.appmetrica) {
            case 0:
                C9730e c9730e = this.vip;
                c9730e.f19236e = null;
                CheckableImageButton checkableImageButton = c9730e.f19245e;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC4340e.purchase(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
