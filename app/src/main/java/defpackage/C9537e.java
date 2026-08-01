package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9537e extends C7140e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C9537e f18902e = new C7140e(1, AbstractC2641e.class, "exitProcess", "exitProcess(I)Ljava/lang/Void;", 9);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        System.exit(((Number) obj).intValue());
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
