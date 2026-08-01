package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1159e extends C8286e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f3744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1159e(C6272e c6272e, ConcurrentHashMap concurrentHashMap, Function1 function1, int i) {
        super(1, c6272e, concurrentHashMap, function1);
        this.f3744e = i;
    }

    public static /* synthetic */ void ad(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 3 ? 3 : 2];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "computation";
        } else if (i != 3) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        }
        if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
        } else {
            objArr[1] = "computeIfAbsent";
        }
        if (i == 2) {
            objArr[2] = "computeIfAbsent";
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3) {
            throw new IllegalStateException(format);
        }
    }

    @Override // defpackage.C8286e, kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        switch (this.f3744e) {
            case 1:
                Object invoke = super.invoke(obj);
                if (invoke != null) {
                    return invoke;
                }
                throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull", "invoke"));
            default:
                return super.invoke(obj);
        }
    }
}
