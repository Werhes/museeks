package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14858e extends AbstractC15946e {
    public final TextView adcel;
    public boolean advert = true;
    public final C15859e mopub;

    public C14858e(TextView textView) {
        this.adcel = textView;
        this.mopub = new C15859e(textView);
    }

    @Override // defpackage.AbstractC15946e
    public final TransformationMethod adcel(TransformationMethod transformationMethod) {
        return this.advert ? ((transformationMethod instanceof C2585e) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C2585e(transformationMethod) : transformationMethod instanceof C2585e ? ((C2585e) transformationMethod).f6442e : transformationMethod;
    }

    @Override // defpackage.AbstractC15946e
    public final boolean billing() {
        return this.advert;
    }

    @Override // defpackage.AbstractC15946e
    public final InputFilter[] purchase(InputFilter[] inputFilterArr) {
        if (!this.advert) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C15859e) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C15859e c15859e = this.mopub;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c15859e;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == c15859e) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.AbstractC15946e
    public final void startapp(boolean z) {
        this.advert = z;
        TextView textView = this.adcel;
        textView.setTransformationMethod(adcel(textView.getTransformationMethod()));
        textView.setFilters(purchase(textView.getFilters()));
    }

    @Override // defpackage.AbstractC15946e
    public final void yandex(boolean z) {
        if (z) {
            TextView textView = this.adcel;
            textView.setTransformationMethod(adcel(textView.getTransformationMethod()));
        }
    }
}
