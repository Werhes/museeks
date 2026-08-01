package defpackage;

import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10879e extends C16622e implements InterfaceC3374e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C17877e f21549e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public volatile C11883e f21550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10879e(C6272e c6272e, C3411e c3411e, C17877e c17877e) {
        super(c6272e, c3411e);
        this.f21549e = c17877e;
        if (c6272e == null) {
            purchase(0);
            throw null;
        }
        this.f21550e = null;
    }

    public static /* synthetic */ void ad(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i != 2 ? 2 : 3];
        if (i != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalArgumentException(format);
        }
    }

    public static /* synthetic */ void purchase(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 2 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.C16622e, kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object invoke;
        C11883e c11883e = this.f21550e;
        if (c11883e == null || ((Thread) c11883e.f23814e) != Thread.currentThread()) {
            invoke = super.invoke();
        } else {
            if (((Thread) c11883e.f23814e) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            invoke = c11883e.f23815e;
        }
        if (invoke != null) {
            return invoke;
        }
        purchase(2);
        throw null;
    }

    @Override // defpackage.C16622e
    public final C16722e license(boolean z) {
        return new C16722e((Object) new C4204e(Collections.singletonList(C18139e.license)), false, 6);
    }

    @Override // defpackage.C16622e
    public final void vip(Object obj) {
        this.f21550e = new C11883e(17, obj);
        try {
            if (obj != null) {
                this.f21549e.invoke(obj);
            } else {
                ad(2);
                throw null;
            }
        } finally {
            this.f21550e = null;
        }
    }
}
