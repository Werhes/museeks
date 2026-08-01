package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0940e extends AbstractC12421e {
    public final ArrayList ad;
    public final Map vip;

    public C0940e(ArrayList arrayList) {
        this.ad = arrayList;
        this.vip = AbstractC10064e.mopub(arrayList);
    }

    @Override // defpackage.AbstractC12421e
    public final boolean ad(C0520e c0520e) {
        return this.vip.containsKey(c0520e);
    }

    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.ad + ')';
    }
}
