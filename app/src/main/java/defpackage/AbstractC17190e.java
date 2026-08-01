package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟۣٗ */
/* loaded from: classes.dex */
public abstract class AbstractC17190e {
    public static final double[][] ad = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final C11797e vip = new C11797e(22);

    public static void ad(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static ArrayList appmetrica(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void billing(InterfaceC13522e interfaceC13522e, Function1 function1) {
        purchase(interfaceC13522e, BuildConfig.FLAVOR, function1);
    }

    public static final String license(String str, String str2) {
        return str.length() == 0 ? str2 : AbstractC0869e.tapsense('.', str, str2);
    }

    public static final void metrica(InterfaceC13522e interfaceC13522e, char c) {
        interfaceC13522e.license(String.valueOf(c));
    }

    public static final void purchase(InterfaceC13522e interfaceC13522e, String str, Function1 function1) {
        if (!(interfaceC13522e instanceof InterfaceC15893e)) {
            throw new IllegalStateException("impossible");
        }
        AbstractC9476e.purchase(1, function1);
        ((InterfaceC15893e) interfaceC13522e).metrica(str, function1);
    }

    public static final void vip(InterfaceC13522e interfaceC13522e, Function1[] function1Arr, Function1 function1) {
        if (!(interfaceC13522e instanceof InterfaceC15893e)) {
            throw new IllegalStateException("impossible");
        }
        Function1[] function1Arr2 = (Function1[]) Arrays.copyOf(function1Arr, function1Arr.length);
        AbstractC9476e.purchase(1, function1);
        ((InterfaceC15893e) interfaceC13522e).startapp(function1Arr2, function1);
    }
}
