package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15787e implements InterfaceC7600e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final int[] f31091e = {R.attr.colorPrimary};

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final int[] f31090e = {R.attr.colorPrimaryVariant};

    public static void ad(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC11408e.f22942while, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                metrica(context, f31090e, "Theme.MaterialComponents");
            }
        }
        metrica(context, f31091e, "Theme.AppCompat");
    }

    public static final boolean appmetrica(InterfaceC2558e interfaceC2558e) {
        return (interfaceC2558e instanceof C10874e) || (interfaceC2558e instanceof C0160e);
    }

    public static C6094e license(String str, InterfaceC13021e interfaceC13021e, C17974e c17974e, Function1 function1, int i) {
        if ((i & 8) != 0) {
            function1 = new C2163e(1);
        }
        Function1 function12 = function1;
        C15420e c15420e = AbstractC6731e.ad;
        return new C6094e(str, new C2362e(21, interfaceC13021e), c17974e, function12, AbstractC9743e.ad(AbstractC5797e.vip(ExecutorC3603e.f8134e, AbstractC5097e.ad())));
    }

    public static void metrica(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(AbstractC5087e.m1746extends("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static TypedArray purchase(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        ad(context, attributeSet, i, i2);
        vip(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void vip(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        /*
            int[] r0 = defpackage.AbstractC11408e.f22942while
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r10.length
            r3 = 1
            r4 = -1
            if (r1 != 0) goto L1f
            int r5 = r0.getResourceId(r2, r4)
            if (r5 == r4) goto L3a
        L1d:
            r2 = r3
            goto L3a
        L1f:
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
            int r6 = r10.length
            r7 = r2
        L25:
            if (r7 >= r6) goto L36
            r8 = r10[r7]
            int r8 = r5.getResourceId(r8, r4)
            if (r8 != r4) goto L33
            r5.recycle()
            goto L3a
        L33:
            int r7 = r7 + 1
            goto L25
        L36:
            r5.recycle()
            goto L1d
        L3a:
            r0.recycle()
            if (r2 == 0) goto L40
            return
        L40:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC15787e.vip(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }
}
