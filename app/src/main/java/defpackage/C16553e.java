package defpackage;

import android.os.Build;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16553e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C17651e f32472e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ C13189e f32473e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ long f32474e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public /* synthetic */ Object f32475e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f32476e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ CharSequence f32477e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f32478e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public CharSequence f32479e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C13189e f32480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16553e(long j, InterfaceC5083e interfaceC5083e, C13189e c13189e, CharSequence charSequence) {
        super(2, interfaceC5083e);
        this.f32477e = charSequence;
        this.f32474e = j;
        this.f32473e = c13189e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C16553e c16553e = new C16553e(this.f32474e, interfaceC5083e, this.f32473e, this.f32477e);
        c16553e.f32475e = obj;
        return c16553e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C16553e) advert((InterfaceC5083e) obj2, C15945e.license(obj))).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C13189e c13189e;
        long j;
        TextSelection textSelection;
        CharSequence charSequence;
        C17651e c17651e;
        int i = this.f32478e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            TextClassifier license = C15945e.license(this.f32475e);
            long j2 = this.f32474e;
            int billing = C12347e.billing(j2);
            int purchase = C12347e.purchase(j2);
            CharSequence charSequence2 = this.f32477e;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence2, billing, purchase);
            c13189e = this.f32473e;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(c13189e.metrica());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection suggestSelection = license.suggestSelection(defaultLocales.build());
            long metrica = AbstractC9262e.metrica(suggestSelection.getSelectionStartIndex(), suggestSelection.getSelectionEndIndex());
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (i2 < 31 || suggestSelection.getTextClassification() == null) {
                this.f32476e = metrica;
                this.f32478e = 2;
                if (C13189e.ad(c13189e, this.f32477e, metrica, license, this) != enumC2821e) {
                    j = metrica;
                }
            } else {
                C17651e c17651e2 = c13189e.appmetrica;
                this.f32475e = suggestSelection;
                this.f32472e = c17651e2;
                this.f32480e = c13189e;
                this.f32479e = charSequence2;
                this.f32476e = metrica;
                this.f32478e = 1;
                if (c17651e2.appmetrica(this) != enumC2821e) {
                    textSelection = suggestSelection;
                    charSequence = charSequence2;
                    c17651e = c17651e2;
                    j = metrica;
                    c13189e.billing.setValue(new C6254e(charSequence, j, textSelection.getTextClassification()));
                    Unit unit = Unit.INSTANCE;
                }
            }
            return enumC2821e;
        }
        if (i == 1) {
            j = this.f32476e;
            charSequence = this.f32479e;
            c13189e = this.f32480e;
            c17651e = this.f32472e;
            textSelection = (TextSelection) this.f32475e;
            AbstractC2003e.purchase(obj);
            try {
                c13189e.billing.setValue(new C6254e(charSequence, j, textSelection.getTextClassification()));
                Unit unit2 = Unit.INSTANCE;
            } finally {
                c17651e.billing(null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f32476e;
            AbstractC2003e.purchase(obj);
        }
        return new C12347e(j);
    }
}
