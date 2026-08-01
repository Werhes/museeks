package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6180e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public crashlytics f12952e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ crashlytics f12953e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f12954e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f12955e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C17195e f12956e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public /* synthetic */ Object f12957e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public String f12958e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public LinkedHashMap f12959e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6180e(crashlytics crashlyticsVar, AbstractC9049e abstractC9049e) {
        super(abstractC9049e);
        this.f12953e = crashlyticsVar;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f12957e = obj;
        this.f12955e |= RecyclerView.UNDEFINED_DURATION;
        return crashlytics.license(this.f12953e, null, this);
    }
}
