package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18398e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C10163e f36067e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f36068e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ Object f36069e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f36070e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ ScrollCaptureCallbackC17336e f36071e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f36072e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f36073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18398e(ScrollCaptureCallbackC17336e scrollCaptureCallbackC17336e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f36071e = scrollCaptureCallbackC17336e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f36069e = obj;
        this.f36068e |= RecyclerView.UNDEFINED_DURATION;
        return ScrollCaptureCallbackC17336e.ad(this.f36071e, null, null, this);
    }
}
