package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17441e extends AbstractC12220e {
    public final C10444e ad;

    public C17441e(Metadata metadata) {
        String[] d1 = metadata.d1();
        d1 = d1.length == 0 ? null : d1;
        if (d1 == null) {
            throw new IllegalArgumentException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
        }
        C6571e purchase = C13814e.purchase(d1, metadata.d2());
        C10444e adcel = AbstractC17673e.adcel((C2009e) purchase.f13543e, (C6746e) purchase.f13544e, new C9400e(metadata.mv()).compareTo(new C9400e(1, 4, 0)) < 0, 4);
        new C9400e(metadata.mv());
        metadata.xi();
        this.ad = adcel;
    }
}
