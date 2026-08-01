package defpackage;

import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13475e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C10659e f26745e = new C10659e(7);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public volatile SoftReference f26746e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Function0 f26747e;

    public C13475e(Object obj, Function0 function0) {
        if (function0 == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f26746e = null;
        this.f26747e = function0;
        if (obj != null) {
            this.f26746e = new SoftReference(obj);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        Object obj2 = f26745e;
        SoftReference softReference = this.f26746e;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object invoke = this.f26747e.invoke();
        if (invoke != null) {
            obj2 = invoke;
        }
        this.f26746e = new SoftReference(obj2);
        return invoke;
    }
}
