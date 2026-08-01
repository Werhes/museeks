package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16018e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18464e f31548e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31549e;

    public C16018e(boolean z, C18464e c18464e) {
        this.f31549e = z;
        this.f31548e = c18464e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (!this.f31549e || !str.equals("Content-Length")) {
            ((C15783e) this.f31548e.f36192e).purchase(str, str2);
        }
        return Unit.INSTANCE;
    }
}
