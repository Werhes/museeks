package defpackage;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class InputConnectionC10217e implements InputConnection {
    public final C15816e ad;
    public final InterfaceC11678e appmetrica;
    public C0398e billing;
    public final C15860e license;
    public final C7911e metrica;
    public int purchase;
    public boolean startapp;
    public final boolean vip;
    public int yandex;
    public final ArrayList adcel = new ArrayList();
    public boolean mopub = true;

    public InputConnectionC10217e(C0398e c0398e, C15816e c15816e, boolean z, C7911e c7911e, C15860e c15860e, InterfaceC11678e interfaceC11678e) {
        this.ad = c15816e;
        this.vip = z;
        this.metrica = c7911e;
        this.license = c15860e;
        this.appmetrica = interfaceC11678e;
        this.billing = c0398e;
    }

    public final void ad(InterfaceC5366e interfaceC5366e) {
        this.purchase++;
        try {
            this.adcel.add(interfaceC5366e);
        } finally {
            vip();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        this.purchase++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        boolean z = this.mopub;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.adcel.clear();
        this.purchase = 0;
        this.mopub = false;
        ArrayList arrayList = ((C14053e) this.ad.f31190e).adcel;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC7890e.billing(((WeakReference) arrayList.get(i)).get(), this)) {
                arrayList.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z = this.mopub;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean z = this.mopub;
        if (z) {
            return false;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z = this.mopub;
        return z ? this.vip : z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.mopub;
        if (z) {
            ad(new C6155e(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        ad(new C13266e(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        ad(new C5880e(i, i2));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return vip();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [eؘؒؖ, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        ad(new Object());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        C0398e c0398e = this.billing;
        return TextUtils.getCapsMode(c0398e.ad.f20850e, C12347e.billing(c0398e.vip), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = (i & 1) != 0;
        this.startapp = z;
        if (z) {
            this.yandex = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC0865e.purchase(this.billing);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (C12347e.license(this.billing.vip)) {
            return null;
        }
        return AbstractC10077e.admob(this.billing).f20850e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return AbstractC10077e.subscription(this.billing, i).f20850e;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return AbstractC10077e.remoteconfig(this.billing, i).f20850e;
    }

    public final void metrica(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        boolean z = this.mopub;
        if (z) {
            z = false;
            switch (i) {
                case R.id.selectAll:
                    ad(new C8930e(0, this.billing.ad.f20850e.length()));
                    break;
                case R.id.cut:
                    metrica(277);
                    return false;
                case R.id.copy:
                    metrica(278);
                    return false;
                case R.id.paste:
                    metrica(279);
                    return false;
                default:
                    return false;
            }
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        boolean z = this.mopub;
        if (z) {
            z = true;
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i);
                        break;
                }
                ((C14053e) this.ad.f31190e).license.invoke(new C10120e(i2));
            }
            i2 = 1;
            ((C14053e) this.ad.f31190e).license.invoke(new C10120e(i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C13749e c13749e = new C13749e(10, this);
            C7911e c7911e = this.metrica;
            int premium = c7911e != null ? AbstractC5666e.premium(c7911e, handwritingGesture, this.license, this.appmetrica, c13749e) : 3;
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC1407e(intConsumer, premium, 0));
            } else {
                intConsumer.accept(premium);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z = this.mopub;
        if (z) {
            return true;
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        C7911e c7911e;
        if (Build.VERSION.SDK_INT < 34 || (c7911e = this.metrica) == null) {
            return false;
        }
        return AbstractC5666e.crashlytics(c7911e, previewableHandwritingGesture, this.license, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.mopub
            if (r0 == 0) goto L79
            r0 = r10 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r3 = r10 & 2
            if (r3 == 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r1
        L14:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4d
            r5 = r10 & 16
            if (r5 == 0) goto L20
            r5 = r2
            goto L21
        L20:
            r5 = r1
        L21:
            r6 = r10 & 8
            if (r6 == 0) goto L27
            r6 = r2
            goto L28
        L27:
            r6 = r1
        L28:
            r7 = r10 & 4
            if (r7 == 0) goto L2e
            r7 = r2
            goto L2f
        L2e:
            r7 = r1
        L2f:
            r8 = 34
            if (r4 < r8) goto L38
            r10 = r10 & 32
            if (r10 == 0) goto L38
            r1 = r2
        L38:
            if (r5 != 0) goto L4a
            if (r6 != 0) goto L4a
            if (r7 != 0) goto L4a
            if (r1 != 0) goto L4a
            if (r4 < r8) goto L47
            r10 = r2
            r1 = r10
        L44:
            r5 = r1
        L45:
            r6 = r5
            goto L50
        L47:
            r10 = r1
            r1 = r2
            goto L44
        L4a:
            r10 = r1
            r1 = r7
            goto L50
        L4d:
            r10 = r1
            r5 = r2
            goto L45
        L50:
            eٕۣۣ r4 = r9.ad
            java.lang.Object r4 = r4.f31190e
            eٓ٘۟ r4 = (defpackage.C14053e) r4
            eّّ۟ r4 = r4.smaato
            java.lang.Object r7 = r4.metrica
            monitor-enter(r7)
            r4.purchase = r5     // Catch: java.lang.Throwable -> L6f
            r4.billing = r6     // Catch: java.lang.Throwable -> L6f
            r4.yandex = r1     // Catch: java.lang.Throwable -> L6f
            r4.startapp = r10     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L71
            r4.appmetrica = r2     // Catch: java.lang.Throwable -> L6f
            eؑٚٞ r10 = r4.adcel     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L71
            r4.ad()     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r10 = move-exception
            goto L77
        L71:
            r4.license = r3     // Catch: java.lang.Throwable -> L6f
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            return r2
        L77:
            monitor-exit(r7)
            throw r10
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.InputConnectionC10217e.requestCursorUpdates(int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, eؕٛؓ] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        ((BaseInputConnection) ((C14053e) this.ad.f31190e).mopub.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.mopub;
        if (z) {
            ad(new C2910e(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.mopub;
        if (z) {
            ad(new C7570e(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        boolean z = this.mopub;
        if (!z) {
            return z;
        }
        ad(new C8930e(i, i2));
        return true;
    }

    public final boolean vip() {
        int i = this.purchase - 1;
        this.purchase = i;
        if (i == 0) {
            ArrayList arrayList = this.adcel;
            if (!arrayList.isEmpty()) {
                ((C14053e) this.ad.f31190e).metrica.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.purchase > 0;
    }
}
