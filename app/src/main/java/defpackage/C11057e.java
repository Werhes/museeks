package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11057e extends AbstractC14934e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11057e(Context context, int i) {
        super(MeasurementManager.get(context));
        switch (i) {
            case 1:
                super((MeasurementManager) context.getSystemService(MeasurementManager.class));
                return;
            default:
                return;
        }
    }
}
