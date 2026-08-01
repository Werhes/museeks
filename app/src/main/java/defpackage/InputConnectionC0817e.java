package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC0817e implements InputConnection {
    public final C14742e ad;
    public final InputConnection metrica;
    public final C12431e vip = new C12431e(0, new Function1[16]);

    public InputConnectionC0817e(C14742e c14742e, EditorInfo editorInfo) {
        this.ad = c14742e;
        this.metrica = AbstractC8178e.metrica(new InputConnectionWrapper(this, false), editorInfo, new C6173e(this));
    }

    public final C17013e ad() {
        return ((C11388e) this.ad.license).license();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((Csuper) this.ad.vip).f36470e++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.vip.startapp();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        if (Build.VERSION.SDK_INT >= 25) {
            return AbstractC9468e.ad(this.metrica, inputContentInfo, i, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.ad.billing(new C17766e(charSequence.toString(), i, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        C14742e c14742e = this.ad;
        c14742e.billing(new C12872e(i, i2, c14742e, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(final int i, final int i2) {
        this.ad.billing(new Function1() { // from class: eٖؕۖ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C2573e c2573e = (C2573e) obj;
                int i3 = i;
                int i4 = i2;
                if (i3 < 0 || i4 < 0) {
                    AbstractC8889e.ad("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i4 + " respectively.");
                }
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    if (i6 >= i3) {
                        break;
                    }
                    int i8 = i7 + 1;
                    long j = c2573e.f6428e;
                    C4860e c4860e = c2573e.f6429e;
                    int i9 = C12347e.metrica;
                    int i10 = (int) (j >> 32);
                    if (i10 <= i8) {
                        i7 = i10;
                        break;
                    }
                    i7 = (Character.isHighSurrogate(c4860e.charAt((i10 - i8) + (-1))) && Character.isLowSurrogate(c4860e.charAt(((int) (c2573e.f6428e >> 32)) - i8))) ? i7 + 2 : i8;
                    i6++;
                }
                int i11 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    int i12 = i11 + 1;
                    long j2 = c2573e.f6428e;
                    C4860e c4860e2 = c2573e.f6429e;
                    int i13 = C12347e.metrica;
                    if (((int) (j2 & 4294967295L)) + i12 >= c4860e2.length()) {
                        i11 = c4860e2.length() - ((int) (c2573e.f6428e & 4294967295L));
                        break;
                    }
                    i11 = (Character.isHighSurrogate(c4860e2.charAt((((int) (c2573e.f6428e & 4294967295L)) + i12) + (-1))) && Character.isLowSurrogate(c4860e2.charAt(((int) (4294967295L & c2573e.f6428e)) + i12))) ? i11 + 2 : i12;
                    i5++;
                }
                long j3 = c2573e.f6428e;
                int i14 = C12347e.metrica;
                int i15 = (int) (j3 & 4294967295L);
                AbstractC6286e.appmetrica(c2573e, i15, i11 + i15);
                int i16 = (int) (c2573e.f6428e >> 32);
                AbstractC6286e.appmetrica(c2573e, i16 - i7, i16);
                return Unit.INSTANCE;
            }
        });
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((Csuper) this.ad.vip).Signature();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.ad.billing(new C14407e(24));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(ad(), C12347e.billing(ad().f33324e), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        C17013e ad = ad();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = ad;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = ad.f33322e.length();
        extractedText.partialStartOffset = -1;
        long j = ad.f33324e;
        extractedText.selectionStart = C12347e.billing(j);
        extractedText.selectionEnd = C12347e.purchase(j);
        extractedText.flags = !AbstractC5304e.isPro(ad, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12347e.license(ad().f33324e)) {
            return null;
        }
        C17013e ad = ad();
        return ad.f33322e.subSequence(C12347e.billing(ad.f33324e), C12347e.purchase(ad.f33324e)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        C17013e ad = ad();
        long j = ad.f33324e;
        CharSequence charSequence = ad.f33322e;
        int purchase = C12347e.purchase(j);
        int purchase2 = C12347e.purchase(ad.f33324e);
        int i3 = purchase2 + i;
        if (((i ^ i3) & (purchase2 ^ i3)) < 0) {
            i3 = charSequence.length();
        }
        return charSequence.subSequence(purchase, Math.min(i3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        C17013e ad = ad();
        int billing = C12347e.billing(ad.f33324e);
        int i3 = billing - i;
        if (((i ^ billing) & (billing ^ i3)) < 0) {
            i3 = 0;
        }
        return ad.f33322e.subSequence(Math.max(0, i3), C12347e.billing(ad.f33324e)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        int i2 = 0;
        switch (i) {
            case R.id.selectAll:
                C14742e c14742e = this.ad;
                c14742e.billing(new C12872e(c14742e, i2, ad().f33322e.length(), 0));
                return false;
            case R.id.cut:
                vip(277);
                return false;
            case R.id.copy:
                vip(278);
                return false;
            case R.id.paste:
                vip(279);
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performEditorAction(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L6
            switch(r4) {
                case 2: goto L12;
                case 3: goto L10;
                case 4: goto Le;
                case 5: goto Lc;
                case 6: goto La;
                case 7: goto L8;
                default: goto L6;
            }
        L6:
            r4 = r0
            goto L13
        L8:
            r4 = 5
            goto L13
        La:
            r4 = 7
            goto L13
        Lc:
            r4 = 6
            goto L13
        Le:
            r4 = 4
            goto L13
        L10:
            r4 = 3
            goto L13
        L12:
            r4 = 2
        L13:
            eٖٔ r1 = r3.ad
            java.lang.Object r1 = r1.purchase
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            if (r1 == 0) goto L23
            eَؚؔ r2 = new eَؚؔ
            r2.<init>(r4)
            r1.invoke(r2)
        L23:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputConnectionC0817e.performEditorAction(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int i;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            return;
        }
        if (i2 >= 34) {
            C14742e c14742e = this.ad;
            i = AbstractC5666e.subs((C11388e) c14742e.license, handwritingGesture, (C7102e) c14742e.startapp, (Function0) c14742e.adcel, (InterfaceC11678e) c14742e.mopub);
        } else {
            i = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC1407e(intConsumer, i, 1));
        } else {
            intConsumer.accept(i);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.metrica.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        C14742e c14742e = this.ad;
        return AbstractC5666e.firebase((C11388e) c14742e.license, previewableHandwritingGesture, (C7102e) c14742e.startapp, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r11) {
        /*
            r10 = this;
            eٖٔ r0 = r10.ad
            java.lang.Object r0 = r0.yandex
            eِٓؓ r0 = (defpackage.C13732e) r0
            r1 = r11 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r2
        Lf:
            r4 = r11 & 2
            if (r4 == 0) goto L15
            r4 = r3
            goto L16
        L15:
            r4 = r2
        L16:
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            if (r5 < r6) goto L4f
            r6 = r11 & 16
            if (r6 == 0) goto L22
            r6 = r3
            goto L23
        L22:
            r6 = r2
        L23:
            r7 = r11 & 8
            if (r7 == 0) goto L29
            r7 = r3
            goto L2a
        L29:
            r7 = r2
        L2a:
            r8 = r11 & 4
            if (r8 == 0) goto L30
            r8 = r3
            goto L31
        L30:
            r8 = r2
        L31:
            r9 = 34
            if (r5 < r9) goto L3a
            r11 = r11 & 32
            if (r11 == 0) goto L3a
            r2 = r3
        L3a:
            if (r6 != 0) goto L4c
            if (r7 != 0) goto L4c
            if (r8 != 0) goto L4c
            if (r2 != 0) goto L4c
            if (r5 < r9) goto L49
            r11 = r3
            r2 = r11
        L46:
            r6 = r2
        L47:
            r7 = r6
            goto L52
        L49:
            r11 = r2
            r2 = r3
            goto L46
        L4c:
            r11 = r2
            r2 = r8
            goto L52
        L4f:
            r11 = r2
            r6 = r3
            goto L47
        L52:
            r0.purchase = r6
            r0.billing = r7
            r0.yandex = r2
            r0.startapp = r11
            if (r1 == 0) goto L6f
            android.view.inputmethod.CursorAnchorInfo r11 = r0.ad()
            if (r11 == 0) goto L6f
            eٍؚؒ r1 = r0.metrica
            android.view.inputmethod.InputMethodManager r2 = r1.m427try()
            java.lang.Object r1 = r1.f3323e
            android.view.View r1 = (android.view.View) r1
            r2.updateCursorAnchorInfo(r1, r11)
        L6f:
            r11 = 0
            if (r4 == 0) goto L8e
            eٌُؑ r1 = r0.appmetrica
            if (r1 == 0) goto L7d
            boolean r1 = r1.purchase()
            if (r1 != r3) goto L7d
            return r3
        L7d:
            eۡۦ r1 = r0.license
            eِٕؖ r2 = new eِٕؖ
            r4 = 21
            r2.<init>(r0, r11, r4)
            r4 = 4
            eٌُؑ r11 = defpackage.AbstractC5336e.purchase(r1, r11, r4, r2, r3)
            r0.appmetrica = r11
            return r3
        L8e:
            eٌُؑ r1 = r0.appmetrica
            if (r1 == 0) goto L95
            r1.Signature(r11)
        L95:
            r0.appmetrica = r11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputConnectionC0817e.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        ((C0909e) this.ad.appmetrica).mo425protected(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        C14742e c14742e = this.ad;
        c14742e.billing(new C12872e(i, i2, c14742e, 2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        C4282e c4282e;
        AbstractC16845e abstractC16845e;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String obj = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj2 : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj2 instanceof BackgroundColorSpan) {
                    c4282e = new C4282e(0L, 0L, null, null, null, null, null, 0L, null, null, null, AbstractC6532e.vip(((BackgroundColorSpan) obj2).getBackgroundColor()), null, null, 63487);
                } else if (obj2 instanceof ForegroundColorSpan) {
                    c4282e = new C4282e(AbstractC6532e.vip(((ForegroundColorSpan) obj2).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                } else if (obj2 instanceof StrikethroughSpan) {
                    c4282e = new C4282e(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C11964e.license, null, 61439);
                } else if (obj2 instanceof StyleSpan) {
                    int style = ((StyleSpan) obj2).getStyle();
                    if (style == 1) {
                        c4282e = new C4282e(0L, 0L, C1812e.f4891e, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                    } else if (style != 2) {
                        if (style == 3) {
                            c4282e = new C4282e(0L, 0L, C1812e.f4891e, new C6277e(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                        }
                        c4282e = null;
                    } else {
                        c4282e = new C4282e(0L, 0L, null, new C6277e(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                    }
                } else if (obj2 instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj2;
                    String family = typefaceSpan.getFamily();
                    if (AbstractC7890e.billing(family, "cursive")) {
                        abstractC16845e = AbstractC16845e.f33003e;
                    } else if (AbstractC7890e.billing(family, "monospace")) {
                        abstractC16845e = AbstractC16845e.f33006e;
                    } else if (AbstractC7890e.billing(family, "sans-serif")) {
                        abstractC16845e = AbstractC16845e.f33005e;
                    } else if (AbstractC7890e.billing(family, "serif")) {
                        abstractC16845e = AbstractC16845e.f33004e;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 != null && family2.length() != 0) {
                            Typeface create = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (AbstractC7890e.billing(create, typeface) || AbstractC7890e.billing(create, Typeface.create(typeface, 0))) {
                                create = null;
                            }
                            if (create != null) {
                                abstractC16845e = new C8982e(new C7850e(2, create));
                            }
                        }
                        abstractC16845e = null;
                    }
                    c4282e = new C4282e(0L, 0L, null, null, null, abstractC16845e, null, 0L, null, null, null, 0L, null, null, 65503);
                } else {
                    if (obj2 instanceof UnderlineSpan) {
                        c4282e = new C4282e(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, C11964e.metrica, null, 61439);
                    }
                    c4282e = null;
                }
                if (c4282e != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new C9363e(c4282e, spanned.getSpanStart(obj2), spanned.getSpanEnd(obj2)));
                }
            }
            arrayList = arrayList2;
        }
        this.ad.billing(new C16202e(obj, arrayList, i, 3));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        C14742e c14742e = this.ad;
        c14742e.billing(new C12872e(c14742e, i, i2, 0));
        ((Function1) c14742e.billing).invoke(Boolean.FALSE);
        return true;
    }

    public final void vip(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }
}
