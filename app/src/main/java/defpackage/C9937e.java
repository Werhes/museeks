package defpackage;

import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9937e {
    public static final C14326e purchase;
    public final ArrayList ad;
    public final C18543e appmetrica;
    public final List license;
    public final int metrica;
    public final C17015e vip;

    static {
        new C14326e("camerax.core.captureConfig.rotation", Integer.TYPE, null);
        new C14326e("camerax.core.captureConfig.jpegQuality", Integer.class, null);
        purchase = new C14326e("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    }

    public C9937e(ArrayList arrayList, C17015e c17015e, int i, ArrayList arrayList2, C18543e c18543e) {
        this.ad = arrayList;
        this.vip = c17015e;
        this.metrica = i;
        this.license = DesugarCollections.unmodifiableList(arrayList2);
        this.appmetrica = c18543e;
    }

    public final Range ad() {
        Range range = (Range) this.vip.smaato(purchase, C6884e.yandex);
        Objects.requireNonNull(range);
        return range;
    }
}
