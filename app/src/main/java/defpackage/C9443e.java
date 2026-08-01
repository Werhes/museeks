package defpackage;

import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9443e implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return ZoneOffset.from(temporalAccessor);
    }
}
