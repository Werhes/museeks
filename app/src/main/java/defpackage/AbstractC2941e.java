package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2941e {
    public static boolean ad(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1016e interfaceC1016e;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC1016e = new C7407e(clipData, 3);
            } else {
                C13911e c13911e = new C13911e();
                c13911e.vip = clipData;
                c13911e.metrica = 3;
                interfaceC1016e = c13911e;
            }
            AbstractC2016e.mopub(textView, interfaceC1016e.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean vip(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1016e interfaceC1016e;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC1016e = new C7407e(clipData, 3);
        } else {
            C13911e c13911e = new C13911e();
            c13911e.vip = clipData;
            c13911e.metrica = 3;
            interfaceC1016e = c13911e;
        }
        AbstractC2016e.mopub(view, interfaceC1016e.build());
        return true;
    }
}
