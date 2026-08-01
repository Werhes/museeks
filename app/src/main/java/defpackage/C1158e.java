package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1158e implements InterfaceC13021e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C1158e f3743e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C6442e f3742e = yandex();

    public static C5267e ad() {
        return new C5267e(false, false, 0, 0, Collections.singletonList(new C14056e(85.0f, 1.0f, -45.0f, 0.0f)), C0193e.f1409e);
    }

    public static C6019e appmetrica() {
        return new C6019e(0.0f, 4, false);
    }

    public static C7190e billing() {
        return new C7190e(false, 1.0f, 60.0f, 10.0f, -2.0f, 0.0f, C0193e.f1409e);
    }

    public static C16801e license() {
        float[] fArr = {32.0f, 63.0f, 125.0f, 250.0f, 500.0f, 1000.0f, 2000.0f, 4000.0f, 8000.0f, 16000.0f};
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new C1050e(fArr[i], 0.0f));
        }
        return new C16801e("flat", "Flat", arrayList);
    }

    public static C6442e yandex() {
        float f = 0.0f;
        return new C6442e(license(), ad(), billing(), new C16074e(true, f, f, 36), appmetrica(), appmetrica(), appmetrica(), appmetrica(), new C8169e(false, 0, EnumC9150e.LINEAR, C0193e.f1409e), 65536);
    }

    @Override // defpackage.InterfaceC13021e
    public final Object metrica(InputStream inputStream) {
        return C6442e.f13334e.license(inputStream);
    }

    @Override // defpackage.InterfaceC13021e
    public final Unit purchase(OutputStream outputStream, Object obj) {
        C6442e.f13334e.yandex(outputStream, (C6442e) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13021e
    public final Object vip() {
        return f3742e;
    }
}
