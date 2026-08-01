package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥٌ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16622e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public volatile Object f32571e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f32572e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6272e f32573e;

    public C16622e(C6272e c6272e, Function0 function0) {
        if (c6272e == null) {
            ad(0);
            throw null;
        }
        this.f32571e = EnumC8150e.f16547e;
        this.f32573e = c6272e;
        this.f32572e = function0;
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        Object invoke;
        EnumC8150e enumC8150e = EnumC8150e.f16544e;
        EnumC8150e enumC8150e2 = EnumC8150e.f16545e;
        Object obj = this.f32571e;
        if (!(obj instanceof EnumC8150e)) {
            AbstractC5851e.smaato(obj);
            return obj;
        }
        this.f32573e.ad.lock();
        try {
            Object obj2 = this.f32571e;
            if (!(obj2 instanceof EnumC8150e)) {
                AbstractC5851e.smaato(obj2);
                return obj2;
            }
            try {
                if (obj2 == enumC8150e2) {
                    this.f32571e = enumC8150e;
                    C16722e license = license(true);
                    if (!license.f32781e) {
                        invoke = license.f32780e;
                        return invoke;
                    }
                }
                if (obj2 == enumC8150e) {
                    C16722e license2 = license(false);
                    if (!license2.f32781e) {
                        invoke = license2.f32780e;
                        return invoke;
                    }
                }
                invoke = this.f32572e.invoke();
                vip(invoke);
                this.f32571e = invoke;
                return invoke;
            } catch (Throwable th) {
                if (AbstractC4584e.license(th)) {
                    this.f32571e = EnumC8150e.f16547e;
                    throw th;
                }
                if (this.f32571e == enumC8150e2) {
                    this.f32571e = new C12746e(th);
                }
                this.f32573e.vip.getClass();
                throw th;
            }
            this.f32571e = enumC8150e2;
        } finally {
            this.f32573e.ad.unlock();
        }
    }

    public C16722e license(boolean z) {
        C16722e license = this.f32573e.license(null, "in a lazy value");
        if (license != null) {
            return license;
        }
        ad(2);
        throw null;
    }

    public void vip(Object obj) {
    }
}
